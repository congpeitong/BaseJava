package invocationHandle.CGLib;

public class UserServiceImpl implements UserService{
    @Override
    public void save() {
        System.out.println("保存");
    }

    @Override
    public void delete() {
        System.out.println("删除");

    }

    @Override
    public void update() {
        System.out.println("更新");

    }

    @Override
    public void find() {
        System.out.println("查找");

    }
}
