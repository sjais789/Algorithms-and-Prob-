///Transpose of a Matrix (in place)
1 0
Converted to :
1 1
0 0






public static void  transpose(int []  tr)    // return type is void because you are changing array (modyfing object itsef).
{
int len = matrix.length-1;
int y=0;

for( i=0; i<len; i++)
{
  for(j= i+1; j<=n;j++)
  {
  temp= tr[i][j];
    tr[i][j]= tr[j][i];
    tr[j][i]= temp;
  }
}


}
