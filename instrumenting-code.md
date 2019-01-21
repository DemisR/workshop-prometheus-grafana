# Instrument Code: Python

*This section is about instrumenting a Python application. If you
 prefer Go, continue with the previous section.*

## The example application

The example application is in the same GitHub repository as these
instructions. If you have not done so yet, clone the repository:

```
$ cd prometheus_workshop/example_python
```

Install the Prometheus Python client library:

```
$ pip install prometheus_client
```

If you don't want to install python libraries globally, pass the `--user` flag to pip.

Run the example application:

```
$ python flask_app.py
```

## Instrument it
Instrument the client and server with Prometheus. Things to keep in mind:

* What would be useful to instrument?
* What would be good variable names?
* How can I instrument in one place rather than many?
* How can/should I use labels?
* How to expose the /metrics endpoint?

The following links will be helpful:
* [Documentation for the Prometheus Python client library](https://github.com/prometheus/client_python#prometheus-python-client).
* [Instrumentation guidelines](http://prometheus.io/docs/practices/instrumentation/).
* [Naming conventions](http://prometheus.io/docs/practices/naming/).



# Instrument Code: Java SpringBoot