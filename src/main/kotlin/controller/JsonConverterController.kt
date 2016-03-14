package controller

import support.Result
import dto.User
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import java.util.*

/**
 * Created by zonehy on 2016.3.14.
 */

@Controller
@RequestMapping("/JsonConverter")
open class JsonConverterController {

    val LOGGER: Logger ? = LoggerFactory.getLogger(this@JsonConverterController.javaClass)

    @RequestMapping("/toJson")
    @ResponseBody
    fun anyToJson(): Result {
        val user = User("tom", 10)
        LOGGER?.info(user.toString())
        return Result().setData(user)
    }


}