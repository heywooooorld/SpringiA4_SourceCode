= How to exercise this application

NOTE: This assumes that you are on a system which includes the curl command line tool. If not, then
you may need to adjust these instructions for your setup.

After running the application, fetch a list of Spittle objects:

```
% curl localhost:8080/spittr/spittles -H "Accept: application/json" -i
```

It should return an empty list, since there have not yet been any Spittles created. So let's create one:

```
% curl localhost:8080/spittr/spittles -H "Content-Type: application/json" -i -d@testdata.json
```

(The testdata.json file is included in this distribution.)

Notice the HTTP status code of 201 and the inclusion of a Location header in the response.

Now let's fetch that single Spittle:

```
% curl localhost:8080/spittr/spittles/1
```

It should return that single Spittle object. And, of course, if you fetch the list of Spittles again, it will now be non-empty:

```
% curl localhost:8080/spittr/spittles
```

But what if you fetch a Spittle that doesn't exist?

```
% curl localhost:8080/spittr/spittles/111
```

