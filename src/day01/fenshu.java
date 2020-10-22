package day01;

public class fenshu {
    int fenmu;
    int fenzi;
    boolean fuhao;
    public fenshu(){}
    public fenshu add(fenshu a,fenshu b) {
        fenshu c = new fenshu();
        if (a.fuhao == b.fuhao)
        {
            c.fenmu = a.fenmu * b.fenmu;
            c.fenzi = a.fenzi * b.fenmu + b.fenzi * a.fenmu;
            c.fuhao = a.fuhao;
        }
        else if (a.fuhao == false)
        {
            c = add(b, a);
        } else
            {
            c.fenmu = a.fenmu * b.fenmu;
            c.fenzi = a.fenzi * b.fenmu - b.fenzi * a.fenmu;
            if (c.fenzi < 0)
            {
                c.fuhao = false;
                c.fenzi = ((c.fenzi < 0) ? -c.fenzi : c.fenzi);
            } else
                {
                    c.fuhao=true;
                }
            }
        int s = gcd(c.fenmu, c.fenzi);
        if(s==0)
            s=1;
        c.fenmu /= s;
        c.fenzi /= s;
        return c;
    }
    private int gcd(int m,int n)//求最小公约数
    {
        if (m < n) {// 保证m>n,若m<n,则进行数据交换
            int temp = m;
            m = n;
            n = temp;
        }
        while (m % n != 0) {// 在余数不能为0时,进行循环
            int temp = m % n;
            m = n;
            n = temp;
        }
        return n;// 返回最大公约数
    }
    //a-b
    public fenshu dec(fenshu a,fenshu b){
        fenshu c=new fenshu();
        b.fuhao=(!b.fuhao);
        c=add(a,b);
        return c;
    }
    //a/b
    public void speak()
    {
        if(this.fuhao==true)
        System.out.printf("此分数值为%d/%d\n",this.fenzi,this.fenmu);
        else
            System.out.printf("此分数值为-%d/%d\n",this.fenzi,this.fenmu);
    }
    public fenshu chufa(fenshu a,fenshu b){
        fenshu c=new fenshu();
        c.fenmu=a.fenmu*b.fenzi;
        c.fenzi=a.fenzi*b.fenmu;
        int s=gcd(c.fenmu,c.fenzi);if(s==0)
            s=1;
        c.fenmu/=s;
        c.fenzi/=s;
        c.fuhao=!(a.fuhao^b.fuhao);
        return c;
    }
    public fenshu chengfa(fenshu a,fenshu b){
        fenshu c=new fenshu();
        c.fenmu=a.fenmu*b.fenmu;
        c.fenzi=a.fenzi*b.fenzi;
        int s=gcd(c.fenmu,c.fenzi);
        if(s==0)
            s=1;
        c.fenmu/=s;
        c.fenzi/=s;
        c.fuhao=!(a.fuhao^b.fuhao);
        return c;
    }
    public  boolean isFuhao()
    {
        int b=0;
        if(this.fenmu>0)
            b++;
        if(this.fenzi>0)
            b++;
        if(b==0||b==2)
            return true;
        else return false;
    }
    public fenshu(int a, int b) {
        fenzi = a;
        fenmu = b;
        fuhao=this.isFuhao();
        a=(a<0)?-a:a;
        b=(b<0)?-b:b;
        int c=gcd(a,b);
        if(c!=0) {
            fenzi = a / c;
            fenmu = b / c;
        }
    }

    public int getFenmu() {
        return fenmu;
    }

    public void setFenmu(int fenmu) {
        this.fenmu = fenmu;
        fuhao=this.isFuhao();
        this.fenmu=((fenmu<0)?-fenmu:fenmu);

    }

    public int getFenzi() {
        return fenzi;
    }

    public void setFenzi(int fenzi) {
        this.fenzi = fenzi;
        fuhao=this.isFuhao();
        this.fenzi=((fenmu<0)?-fenzi:fenzi);
    }
}

