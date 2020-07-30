    public void sortColors(int[] nums) {
        int a = 0;
        int k = 0;
        int b = nums.length - 1;
        while (k <= b){
            switch(nums[k]){
                case 0:nums[k] = nums[a];
                nums[a] = 0;
                a++;
                k++;
                break;
                case 2:nums[k] = nums[b];
                nums[b] = 2;
                b--;
                break;
                default:
                k++;
                break;
            }
        }
    }