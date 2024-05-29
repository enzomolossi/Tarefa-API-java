# DefaultApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tasksGet**](DefaultApi.md#tasksGet) | **GET** /tasks | Retorna todas as tarefas
[**tasksIdGet**](DefaultApi.md#tasksIdGet) | **GET** /tasks/{id} | Retorna uma tarefa pelo ID
[**tasksPost**](DefaultApi.md#tasksPost) | **POST** /tasks | Cria uma nova tarefa


<a name="tasksGet"></a>
# **tasksGet**
> kotlin.collections.List&lt;Task&gt; tasksGet()

Retorna todas as tarefas

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
try {
    val result : kotlin.collections.List<Task> = apiInstance.tasksGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#tasksGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#tasksGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;Task&gt;**](Task.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tasksIdGet"></a>
# **tasksIdGet**
> Task tasksIdGet(id)

Retorna uma tarefa pelo ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val id : kotlin.Long = 789 // kotlin.Long | 
try {
    val result : Task = apiInstance.tasksIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#tasksIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#tasksIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |

### Return type

[**Task**](Task.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tasksPost"></a>
# **tasksPost**
> Task tasksPost(task)

Cria uma nova tarefa

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val task : Task =  // Task | 
try {
    val result : Task = apiInstance.tasksPost(task)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#tasksPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#tasksPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task** | [**Task**](Task.md)|  |

### Return type

[**Task**](Task.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

