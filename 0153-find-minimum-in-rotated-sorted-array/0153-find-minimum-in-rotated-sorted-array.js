/**
 * @param {number[]} nums
 * @return {number}
 */
var findMin = function(nums) {
    if(nums[0]<=nums[nums.length-1]){
        return nums[0];
    }

    let start = 0;
    let end = nums.length-1;

    while(start<end){
        let mid =start+ Math.floor((end-start)/2);

        if(nums[start]<nums[mid]){
            start = mid;
        } else {
            end = mid;
        } 
    }

    return nums[start+1];
};