var cross = {};
cross.Event = {};

cross.Event.addListener = function(element, name, handler, capture){
	capture = capture | false;
	
	if(element.addEventListener){//표준브라우저
		element.addEventListener(name, handler, capture);
	}else{//구형IE
		element.attachEvent('on'+name, handler);
	}	
}

cross.Event.stopBubble = function(event){
	if(event.stopPropagation){//표준브라우저
		event.stopPropagation();
	}else{
		event.cancelBubble = true;
	}
}











