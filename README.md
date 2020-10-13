# jsf-reproducer project


```
./mvnw clean package
```

```
[ERROR]     [error]: Build step io.quarkus.arc.deployment.ArcProcessor#generateResources threw an exception: java.lang.NullPointerException
[ERROR]     at io.quarkus.arc.processor.AsmUtilCopy.needsSignature(AsmUtilCopy.java:261)
[ERROR]     at io.quarkus.arc.processor.AsmUtilCopy.needsSignature(AsmUtilCopy.java:232)
[ERROR]     at io.quarkus.arc.processor.ClientProxyGenerator.generate(ClientProxyGenerator.java:117)
[ERROR]     at io.quarkus.arc.processor.BeanProcessor.generateResources(BeanProcessor.java:185)
[ERROR]     at io.quarkus.arc.deployment.ArcProcessor.generateResources(ArcProcessor.java:448)
[ERROR]     at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
[ERROR]     at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
[ERROR]     at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
[ERROR]     at java.lang.reflect.Method.invoke(Method.java:498)
[ERROR]     at io.quarkus.deployment.ExtensionLoader$2.execute(ExtensionLoader.java:936)
[ERROR]     at io.quarkus.builder.BuildContext.run(BuildContext.java:277)
[ERROR]     at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
[ERROR]     at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:2046)
[ERROR]     at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1578)
[ERROR]     at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1452)
[ERROR]     at java.lang.Thread.run(Thread.java:748)
[ERROR]     at org.jboss.threads.JBossThread.run(JBossThread.java:479)
[ERROR] -> [Help 1]
```

```
PRODUCER METHOD bean [types=[java.lang.Object], qualifiers=[@Default, @Any, @Named(value = "session")], target=java.lang.Object getSession(), declaringBean=org.apache.myfaces.cdi.JsfArtifactProducer]
```