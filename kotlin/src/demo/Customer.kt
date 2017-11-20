package demo

class Customer (var name : String, var email : String){
    override fun toString():String{
        return "[name="+name+",email="+email+"]"
    }
    
}