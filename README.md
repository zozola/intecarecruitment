# Evaluation excercise

Source code for evaluation excercise for the recruitment process for Inteca company.

## database

Building a docker with database.

```
$ docker pull mysql
$ docker build -t db ozagrabska.database
$ docker run -p 3306:3306 -d db
```

Connecting to database

```
$ mysql --host=localhost --port=3306 --user=familyuser --password=kotki123
```

## familyapp

Running familyapp:

```
$ cd ozagrabska.familyapp
$ ./mvnw spring-boot:run
```
