<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces = "true" %>

<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/4.7.6/handlebars.min.js" ></script>
<script type="text/x-handlebars-template"  id="subMenu-list-template" >
{{#each .}}
	<li class="nav-item subMenu" >
      	<a href="javascript:goPage('{{murl}}','{{mcode}}')" class="nav-link">
          <i class="{{micon}}"></i>
             <p>{{mname }}</p>
        </a>
	</li>
{{/each}}
</script>
<script>

var printData=function(subMenuArr,target,templateObject){
	var template=Handlebars.compile(templateObject.html());
	var html = template(subMenuArr);	
	$('.subMenu').remove();
	target.append(html);
}


function goPage(url, mCode){
	// HTML5 지원브라우저에서 사용가능
	if(typeof(history.pushState)=='function'){
		// 현재 주소를 가져온다.
		var renewURL = location.href;
		// 현재 주소중 .do 뒤 부분이 있다면 날려버린다.
		renewURL = renewURL.substring(0, renewURL.indexOf(".do")+3);
		
		if(mCode != 'M000000'){
			renewURL += "?mCode="+mCode;
		}
		
		history.pushState(mCode,null,renewURL);
	}else{
		location.hash = "#"+mCode;
	}
	$('#if_list').attr("src","<%=request.getContextPath()%>"+url);
	
}

function goPageMain(url){
	   // HTML5 지원브라우저에서 사용가능
	   if(typeof(history.pushState)=='function'){
	      // 현재 주소를 가져온다.
	      var renewURL = location.href;
	      // 현재 주소중 .do 뒤 부분이 있다면 날려버린다.
	      renewURL = renewURL.substring(0, renewURL.indexOf(".do")+3);      
	      
	      
	      history.pushState(null, renewURL);
	   }
	   $('#if_list').attr("src","<%=request.getContextPath()%>"+url);
	   
	}

	function calcHeight(){
	   //find the height of the internal page
	   
	   var the_height=
	   document.getElementById('if_list').contentWindow.document.body.scrollHeight;
	   
	   //change the height of the iframe
	   $('#if_list_div').css("height",the_height);
	   
	   //document.getElementById('the_iframe').scrolling = "no";
	   document.getElementById('if_list').style.overflow = "hidden";
	}

	goPage('${menu.murl}','${menu.mcode}');



</script>