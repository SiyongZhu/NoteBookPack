# NoteBookPack

This is a simple note taking web app from RomanianCoder
Use it to learn Angular and connect to Spring and Mysql

```
$ docker pull mysql/mysql-server
$ docker create -v /var/lib/mysql --name mysqldata alpine
$ docker run --name mysqldb --volumes-from mysqldata -e MYSQL_ROOT_PASSWORD=password -p 3307:3306 mysql/mysql-server
```
