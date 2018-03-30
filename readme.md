docker run --name db -e 'ACCEPT_EULA=Y' -e 'SA_PASSWORD=Password1@' -e 'MSSQL_PID=Express' -p 4000:1433 -v /Users/ravimeda/Desktop/MyDrive/sqlDbVolume/:/var/opt/mssql -v /var/opt/mssql/data -d microsoft/mssql-server-linux:latest



docker run --network satisfy-network --name db -e 'ACCEPT_EULA=Y' -e 'SA_PASSWORD=Password1@' -e 'MSSQL_PID=Express' -p 4000:1433 -v /Users/ravimeda/Desktop/MyDrive/sqlDbVolume/:/var/opt/mssql -v /var/opt/mssql/data -d microsoft/mssql-server-linux:latest



docker run --name app --network satisfy-network -p 8080:8080 --rm -it -d satisfy



local db connection

url: jdbc:sqlserver://db:1433
username: AdminUser
password: P@ssw0rd
driver: com.microsoft.sqlserver.jdbc.SQLServerDriver