package com.example.app_rosa

import io.github.rybalkinsd.kohttp.dsl.httpGet
import io.github.rybalkinsd.kohttp.dsl.httpPost
import io.github.rybalkinsd.kohttp.dsl.upload
import io.github.rybalkinsd.kohttp.ext.url
import okhttp3.Response
import java.io.File

//http://192.168.1.51:3000/



fun post(text: String, route: String = "/"): String? {
    val response: Response = httpPost {
        url("http://192.168.1.51:3000$route")

        param {  }
        header {  }

        body {
            json {
                "text" to text
            }
        }
    }

    return response.body()?.string()
}

fun postFile(yourFile: File, route: String = "/upload_file"): String? {
    println("POSTFILE IS BEING EXECUTED!")

    val response: Response = upload {
        url("http://192.168.1.36:3000$route")

        file(yourFile.toURI())
        param {  }
        header {  }

    }

    print("Response: " + response.body())
    return response.body()?.string()
}

fun get(): String? {
    val response: Response = httpGet {
        host = "192.168.1.51"
        port = 3000
        path = "/dialog"

        param {  }
        header {  }
    }

    return response.body()?.string()
}