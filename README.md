# NoteBookPack

This is a simple note taking web app from RomanianCoder
Use it to learn Angular and connect to Spring and Mysql

```
$ docker pull mysql/mysql-server
$ docker create -v /var/lib/mysql --name vc_mysqldata alpine
$ docker run -d --name my_mysqldb --volumes-from vc_mysqldata -e MYSQL_ROOT_PASSWORD=password -p 3306:3306 mysql/mysql-server
$ docker exec -it my_mysqldb mysql -ppassword
```

**Install Angular to Mac**
I have some issue install angular on Mac, follow the steps in here to resolve installation issues

First, download node js package from node js website, install to Mac
```
mkdir ~/.npm-global
npm config set prefix '~/.npm-global'
add following to ~/.bash_profile
export PATH="~/.npm-global/bin:$PATH"
source ~/.bash_profile
npm install -g @angular/cli
```


[Spring Mongo Reference](https://docs.spring.io/spring-data/data-document/docs/current/reference/html)
