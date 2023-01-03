// Bai 8: S = 1/2 + 3/4 + 5/6 + ... + (2n + 1) / (2n + 2);

let n = 10;
let s = 0;
for(let i = 0; i <= n; i ++) {
    s += (2*i + 1) / (2*i + 2);
} 

console.log(s);

// Output: 9.490061327561328