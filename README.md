# NoteBookPack

This is a simple note taking web app from RomanianCoder
Use it to learn Angular and connect to Spring and Mysql

```
$ docker pull mysql/mysql-server
$ docker create -v /var/lib/mysql --name vc_mysqldata alpine
$ docker run -d --name my_mysqldb --volumes-from vc_mysqldata -e MYSQL_ROOT_PASSWORD=password -p 3306:3306 mysql/mysql-server
$ docker exec -it my_mysqldb mysql -ppassword
```
