package support

/**
 * Created by zonehy on 2016.3.14.
 */

class Result {
    var isSuccess: Boolean = false
    var data: Any ? = null
    var errMsg: String ? = null

    constructor() {
        this.isSuccess = true
    }

    constructor(errMsg: String) {
        this.errMsg = errMsg
    }

    fun setData(data: Any): Result {
        this.data = data
        return this
    }
}