/**
 * @param {number[]} piles
 * @param {number} h
 * @return {number}
 */
var minEatingSpeed = function(piles, h) {

    let start = 1;
    let end = Math.max(...piles);
    let result = end;

    while (start <= end) {

        let mid = Math.floor(start + (end - start) / 2);
        let hours = 0;

        for (let i = 0; i < piles.length; i++) {
            hours += Math.ceil(piles[i] / mid);
        }

        if (hours <= h) {
            result = mid;      // possible answer
            end = mid - 1;     // try smaller
        } else {
            start = mid + 1;   // need faster speed
        }
    }

    return result;
};