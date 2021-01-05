upstream java {
  server 127.0.0.1:8080 fail_timeout=0;
}

server {
    listen 80 default_server;
    listen [::]:80 default_server;
    #server_name _;
    #return 301 https://$host$request_uri;
        access_log /opt/gaudi/logs/app.nginx.access.log;
        error_log  /opt/gaudi/logs/app.nginx.error.log;

        location / {
            proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
            proxy_set_header X-FORWARDED-PROTO $scheme;
            proxy_set_header Host $http_host;
            proxy_redirect off;
            proxy_pass http://java;
        }
}
