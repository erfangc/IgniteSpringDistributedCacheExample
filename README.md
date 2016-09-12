# IgniteSpringDistributedCacheExample

A small project to show how to use Apache Ignite and Spring Caching
Abstractions

# Install

```bash
mvn clean package -DskipTests
```

# Run 2 Instances on the Same Host

```bash
java -jar -Dserver.port=8080 target/spring-ignite-sandbox-0.0.1-SNAPSHOT.jar
```

Then on a separate terminal

```bash
java -jar -Dserver.port=9090 target/spring-ignite-sandbox-0.0.1-SNAPSHOT.jar
```

# Run 2 Instances on Separate Hosts

The procedure is exactly the same, except one does not actually need to vary the ports.
Just `scp` the jar to be available on all hosts required

# Test out the distributed cache

```bash
# this request should take ~3s (artificially set to simulate long running operation)
curl 'localhost:8080/test'

# try again - and the response should be instantaneous
curl 'localhost:8080/test'

# try again on port 9090, response should ALSO be instantaneous
curl 'localhost:9090/test'
```

# Multicast Auto-Discovery

Ignite nodes are discovered through IP multicast messages (configured
through `example-cache.xml`)

# TODO

Figure out control over discovery and port binding, especially if we are
running in shared environments and networks where multicast might not be
possible

**Bonus Objective** Test out as a docker image, can we scale the
embedded Ignite cache by raising the # instances in Marathon for
example!
