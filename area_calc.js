var args = 0;


function list() {
	var height_arr = arrayfromargs(arguments);
	var total_height = 0;
	
	for (var i = 0; i < height_arr.length; i++) {
		total_height += height_arr[i];
	}
	
	outlet(0, total_height);
}