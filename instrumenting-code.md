# Instrument Code: Python

## The example application

A simple python flask application using prometheus client library to generate metrics from the application.

You can use the application directly with Docker and docker-compose, but I encourage you to look the code and how the metrics are generated.

For change the application and run it on your laptop, follow those instructions.

```
$ cd prometheus_workshop/example_python
```

Install the Prometheus Python client library and other dependencies:

```
$ pip install -r example_python/requirements.txt
```

If you don't want to install python libraries globally, pass the `--user` flag to pip.

Run the example application:

```
$ python example_python/app.py
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

With the version 2 of SpringBoot , the standard way to generte metrics it's use Micrometer library. (backported in Springboot 1.5)
This library can expose metrics in differents formats and you can easilly add custom metrics to you app.

If you enable Prometeus format for SpringBoot micrometer, you can use this dashboard for view all standard metrics.
Install dashboard https://grafana.com/dashboards/4701

Look, the example code for see how you can add custom metrics to your application.

( Counter of hellos )