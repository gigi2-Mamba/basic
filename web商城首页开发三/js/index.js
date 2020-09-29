function soso(){
    var content =document.getElementById("content").value
    alert("搜索的内容是：" +content )

}
// function showTime() {
// 	var date =new Date();
// 	var y =date.getMonth() + 1;
// 	var m =date.getDate();
// 	var d =date.getHours();
// 	var min =date.getMinutes();
// 	if(min <10)min = "0" + min
// 	var s = date.getSeconds()
// 	if(s<10) s= "0" + s
// 	var time = y + "-" + m + "-" + d + " " + h + " : " + min + " : " + s
// 	document.getElementById("time").innerHTML = time;
//
// }
var t =null
window.onload = function (){
		// showTime()
		// setInterval(showTime,1000)
		//每隔四秒钟换一张图片
		t=window.setInterval(showImg,3000)

	   //鼠标点击数字li直接显示对应图片
	   //获取所有数字li
	      var numLis = document.getElementById("nums").getElementsByTagName('li');
		//给每个li绑定事件
	   for (var i = 0; i < numLis.length; i++){
	   	    numLis[i].onclick = function () {
	   	    	// console.log(this)
				//获取节点内容
				console.log(this.innerHTML)
               index = parseInt(this.innerHTML) - 1;
				showImg();
			}
	   }

		}
	

	//图片的显示和隐藏
	var index = 0 //默认显示第一个li
	//图片显示的方法
	function showImg(){
		//获取所有的li
		var imgLis = document.getElementById("imgs").getElementsByTagName('li')
		var numLis = document.getElementById("nums").getElementsByTagName('li')
		//循环imglis数组，当点循环对象的索引值和index相等，显示该li否则都隐藏
		for (var i= 0; i< imgLis.length;i++) {
			if(i == index){
				imgLis[i].style.display = "block"
				numLis[i].style.backgroundColor = "red"
			} else {
				imgLis[i].style.display = "none"
				numLis[i].style.backgroundColor = ""

			}
		}
		index ++
		//边界
		if(index>= imgLis.length){
			index = 0
		}
		
	}
	