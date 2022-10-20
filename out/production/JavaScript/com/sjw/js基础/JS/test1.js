function fun1(a){
    if (a)
        return fun1(a-1)* a;
    else
        return 1;
}

var b = fun1(100);
document.write(b+"<br>")
var d=new Date()
document.write(d.toLocaleString()+"<br>")

reg=new RegExp("\w{1,2}");

alert(reg.test("1222223"))
