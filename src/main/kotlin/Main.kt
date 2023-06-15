fun main() {

}
class Stack{
    var data = mutableListOf<Int>()

    fun push(value: Int){
        data.add(value)
    }

    fun pop():Int?{
        if (data.isEmpty()){
            return null
        }
        var top = data[data.lastIndex]
        data.removeAt(data.lastIndex)
        return top
    }

    fun peek(): Int?{
        if(data.isEmpty()){
            return null
        }
        return data[data.lastIndex]
    }

    fun isEmpty(): Boolean{
        return data.isEmpty()
    }
}