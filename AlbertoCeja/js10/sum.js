function sum(a, b) {
    return a + b;
  }
  
  module.exports = sum;
const sum = require ("./sum") ;

test ("Sumamos 1 + 2 y esperamos 3" , ()=>{
    expect( sum( 1 , 2 )).toBe(3);
});
{
  "dependencies": {
    "jest": "^27.5.1"
  },
  
}
