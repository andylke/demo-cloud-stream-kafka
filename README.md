# Demo Application using Spring Cloud Stream Kafka

## To Create project using Spring Initializr
```
curl https://start.spring.io/starter.tgz ^
  -d dependencies=web,actuator,cloud-stream,kafka ^
  -d packageName=com.github.andylke.demo ^
  -d groupId=com.github.andylke.demo ^
  -d artifactId=demo-cloud-stream-kafka ^
  -d bootVersion=2.3.8.RELEASE ^
  -d baseDir=demo-cloud-stream-kafka ^
  | tar -xzvf -
```

## To Install Kafka using Helm on Local Kubernetes
```
helm repo add bitnami https://charts.bitnami.com/bitnami
```

## Parameters to Enable External Access
[Exposure parameters](https://github.com/bitnami/charts/tree/master/bitnami/kafka/#exposure-parameters)

|Parameter | Description | Default |
|----------|-------------|---------|
| `externalAccess.enabled` | Enable Kubernetes external cluster access to Kafka brokers | false |
| `externalAccess.service.type` | Kubernetes Service type for external access. It can be NodePort or LoadBalancer | `LoadBalancer` |
| `externalAccess.service.port` | Kafka port used for external access when service type is LoadBalancer | 9094 |

## To Install Kafka with External Access
```
helm install demo ^
  --set externalAccess.enabled=true ^
  --set externalAccess.service.type=LoadBalancer ^
  --set externalAccess.service.port=9094 ^
  --set externalAccess.autoDiscovery.enabled=true ^
  --set serviceAccount.create=true ^
  --set rbac.create=true ^
  bitnami/kafka
```

## To Delete Kafka
```
helm delete demo
```

## References
[https://github.com/bitnami/charts/tree/master/bitnami/kafka/](https://github.com/bitnami/charts/tree/master/bitnami/kafka/)
