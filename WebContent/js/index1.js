$(function(){
		$.ajax({
			type:"get",
			url:"http://localhost:9090/SpringMVC/test",
			//JSON.stringify将json对象转换成json字符串传递
			data:JSON.stringify("{name:'4444'}"),
			//默认是以表单的形式，现在以json的数据格式传送
			contentType:"application/json;charset=UTF-8",
			//返回的数据以json接收
			dataType:"json",
			function(data){
				alert(data.name);
			}
		})
	
	})