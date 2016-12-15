# lovelydesk-api

## Usage

### Running

`lein ring server`

### Packaging and running as standalone jar

```
lein do clean, ring uberjar
java -jar target/lovelydesk.jar
```

### Packaging as war

`lein ring uberwar`

## License

Copyright © 2014-2015 

Distributed under the Eclipse Public License, the same as Clojure.
