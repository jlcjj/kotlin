package entity

//import com.sun.deploy.net.HttpResponse

data class HttpResponse(
        val statusCode: Int,
        val jsonResponse: String
)