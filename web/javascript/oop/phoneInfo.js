function phoneInfo(name, tel){
	this.name = name;
	this.tel = tel;
	this.toString = function(){
		//console.log(this.name, this.tel);
		return this.name + "\t" + this.tel;
	}
}