# Football League Displayer
## Author
Abdul Aziz Nassor

## Description

This project cosists of an in-depth Java Spring Web Application that involve using databases.

This project was based on a football league. I had to create base classes (Fixture, League, Player, Statistics, Team) and set the relationship for each of them in the database (one-to-many, many-to-many, many-to-one).

Controllers had to be created to control each of these classes for creation and deletion in the database. An additional controller also displays the different objects on a web app view to the user.

Repositories was also used to give the ability to look for different objects using their id, name etc.

## What I learnt
* Spring MVC
* Java Classes
* Creating relationships
* Controllers
* Repositories

## Installation

Go onto Github, find the project and clone the repository.
Afterwards, open bash, locate the destinated file with 'cd', and use git clone on the cloned repository.

```bash
git clone https://github.com/aanassor1/Football-League-Displayer.git
```

After, create a java product on an IDE that allows packages. Then create a package for each folder (model, controller, repo) and then put in the respective children in each of those folders. Put the views folder into the main project folder, resouces and the Hw2Application.java file.

Access the application.resources folder and change the datasource url, username, and password to your database settings.

Then, run the Hw2Application file and on your website, open up the website - http://localhost:8080/.
