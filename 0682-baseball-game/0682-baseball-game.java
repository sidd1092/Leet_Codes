class Solution {
    public int calPoints(String[] arr){
        //using arrai list
        List<Integer> list = new ArrayList<>();
        for(String op : arr){
            if(op.equals("C")){
                list.remove(list.size()-1);
            }else if(op.equals("D")){
                list.add(2*list.get(list.size()-1));
            }else if(op.equals("+")){
                list.add(list.get(list.size()-1)+list.get(list.size()-2));
            }else{
                list.add(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for(int i : list){
            sum+=i;
        }
        return sum;
    }
}