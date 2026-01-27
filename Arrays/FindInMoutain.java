
interface MountainArray {
    public int get(int index);
    public int length();
}


class MountainArrayImpl implements MountainArray {
    private int[] arr;

    MountainArrayImpl(int[] arr) {
        this.arr = arr;
    }

    public int get(int index) {
        return arr[index];
    }

    public int length() {
        return arr.length;
    }
}

 class FindInMountain {

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);

        // Binary search in increasing part
        int start = 0;
        int end = peak;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = mountainArr.get(mid);

            if (target < midVal) {
                end = mid - 1;
            } else if (target > midVal) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        // Binary search in decreasing part
        start = peak + 1;
        end = mountainArr.length() - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = mountainArr.get(mid);

            if (target < midVal) {
                start = mid + 1;
            } else if (target > midVal) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static int findPeak(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;

        while (start != end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 6, 3, 2};
        MountainArray mountainArr = new MountainArrayImpl(arr);

        FindInMountain fm=new FindInMountain();
        int target = 3;

        int result =fm.findInMountainArray(target, mountainArr);
        System.out.println(result);
    }
}
