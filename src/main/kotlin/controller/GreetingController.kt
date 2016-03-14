package controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

/**
 * Created by zonehy on 2016.3.14.
 */

@Controller
@RequestMapping("/Greeting")
open class GreetingController {

    val LOGGER: Logger ? = LoggerFactory.getLogger(this@GreetingController.javaClass)


    @RequestMapping(value = "/{name}", method = arrayOf(RequestMethod.GET))
    @ResponseBody
    open fun greeting(@PathVariable("name") name: String): Any {
        LOGGER?.info("PathVariable name == $name")
        return "Hello  $name !"
    }


}