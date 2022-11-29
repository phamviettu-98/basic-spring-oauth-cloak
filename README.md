# basic-spring-oauth-cloak
Setting cloak server : spring boot + java 8 : version cloak: 18.0.2
run cloak : standalone.bat -Djboss.socket.binding.port-offset=100
Link : http://localhost:8180/auth
create acount: admin
add realm 
create Client :  - click Client
                 -click create: clientId: springboot-keycloak
                                root Url: http://localhost:9090
 create Roles:  admin
                user
Create User : - add user 
              - add  Credentail : password  
              - Note :  Temporary: click off      
truy cập :https://www.keycloak.org/docs/latest/securing_apps/#_oidc     set file pom
   ava adapter -> spring boot adapter

 Get token bằng postman:
    - click realm  setting -> click  endpoint -> get link token_endpoint
    - Open post man. Link : token_endpoint
    - click auth: oauth2
             - Grant Type : password
             - Access Token URL:   link  token_endpoint      
             - Client ID: Client ID cloak    
             - Username
             - Password
             - Scope: openid
