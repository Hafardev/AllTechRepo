package com.example.data.network.interceptor

import android.content.Context
import okhttp3.Interceptor
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.Protocol
import okhttp3.Response
import okhttp3.ResponseBody
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader

class MockInterceptor(private val context: Context) : Interceptor {

        companion object {
            private val JSON_MEDIA_TYPE = ("application/json").toMediaType()
            private const val MOCK = "mock"
        }

        override fun intercept(chain: Interceptor.Chain): Response {
            val request = chain.request()
            val path: String = request.url.encodedPath

            /* I put a 'hello' file in debug/assets/mockData */
            val stream: InputStream = context.assets?.open("datamock$path")!!
            //context.assets.open("mocks/$filename.json")
         //   context.assets?.open("datamock$path")!!
            /* Just read the file. */
            val json: String = parseStream(stream)

            val header = request.header(MOCK)

            if (header != null) {
                val filename = request.url.pathSegments.last()
                return Response.Builder()
                    .request(request)
                    .protocol(Protocol.HTTP_1_1)
                    .message("")
                    .code(200)
                    .body(ResponseBody.create(JSON_MEDIA_TYPE, json ))
                    .build()
            }

            return chain.proceed(request.newBuilder().removeHeader(MOCK).build())
        }

/*

    fun interceptMock(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val path: String = request.url.encodedPath

        */
/* I put a 'hello' file in debug/assets/mockData *//*

        val stream: InputStream = context?.assets?.open("datamock$path")!!

        */
/* Just read the file. *//*

        val json: String = parseStream(stream)

        val response = Response.Builder()
            .body(ResponseBody.create(JSON_MEDIA_TYPE, json))
            .request(chain.request())
            .protocol(Protocol.HTTP_2)
            .code(200)
            .build()




        //val response = chain.proceed(request)
        val resBody = response.body
        if (response.isSuccessful) {
            try {
                return resBody?.let {
                    val newBody = extractDataFromResponse(it.string(), response)
                    response.newBuilder().body(newBody).build()
                } ?: response
            }catch (e: Exception){
                println("resultBody1 ${e.message}")
            }
        }else {
            try {

            }catch (e: Exception){
                println("resultBody ${e.message}")
            }
        }
        return response
    }
*/


    @Throws(IOException::class)
    private fun parseStream(stream: InputStream): String {
        val builder = java.lang.StringBuilder()
        val `in` = BufferedReader(InputStreamReader(stream, "UTF-8"))
        var line: String?
        while (`in`.readLine().also { line = it } != null) {
            builder.append(line)
        }
        `in`.close()
        return builder.toString()
    }
    }
