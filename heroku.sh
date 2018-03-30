heroku container:login
heroku container:push web -a zyxwvut
heroku ps:scale web=1 -a zyxwvut