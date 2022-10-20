i=1;
function fun1(){
    var light = document.getElementById("light");
    if (i){
        light.src="on.gif";
    }else{
        light.src="off.gif";
    }
    i = 1^i;
}


var light = document.getElementById("light");
light.onclick=fun1;