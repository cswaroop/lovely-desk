Steps:

1. Unzip the postgres
2. 
`
@ECHO ON
REM The script sets environment variables helpful for PostgreSQL
@SET PATH="%~dp0\bin";%PATH%
@SET PGDATA=%~dp0\data
@SET PGDATABASE=postgres
@SET PGUSER=postgres
@SET PGPORT=5439
@SET PGLOCALEDIR=%~dp0\share\locale
REM "%~dp0\bin\initdb" -U postgres -A trust
"%~dp0\bin\pg_ctl" -D "%~dp0/data" -l logfile start
ECHO "Click enter to stop"
pause
"%~dp0\bin\pg_ctl" -D "%~dp0/data" stop
`

You would see something like this
`
> bin\initdb -U postgres -A trust -D data
The files belonging to this database system will be owned by user "SwaroopChalasani".
This user must also own the server process.

The database cluster will be initialized with locale "English_United States.1252".
The default database encoding has accordingly been set to "WIN1252".
The default text search configuration will be set to "english".

Data page checksums are disabled.

creating directory data ... ok
creating subdirectories ... ok
selecting default max_connections ... 100
selecting default shared_buffers ... 128MB
selecting dynamic shared memory implementation ... windows
creating configuration files ... ok
running bootstrap script ... ok
performing post-bootstrap initialization ... ok
syncing data to disk ... ok

Success. You can now start the database server using:

    "bin\pg_ctl" -D "data" -l logfile start
 `

