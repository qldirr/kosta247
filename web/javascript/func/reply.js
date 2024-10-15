var replyService = (function(){
	
	function getList(param, callback){
		var data = "결과값";
		callback(data);
	}
	
	function create(){console.log("create")}	
	function update(){console.log("update")}	
	
	return {
		getList : getList,
		create : create,
		update : update
	};
	
	
})();