package com.tistory.devshock.chapter7.Abstract;

abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop() { /** 현재 위치에서 정지 **/ }
}

class Marine2 extends Unit{      // 보병
    int x, y;       // 현재 위치
    void move(int x, int y) { /** 지정된 위치로 이동 **/ }
    void stimPack()         { /** 스팀팩을 사용한다  **/ }
}

class Tank2 extends Unit{      // 보병
    int x, y;       // 현재 위치
    void move(int x, int y) { /** 지정된 위치로 이동 **/ }
    void changeMode()       { /** 공격모드를 변환한다**/ }
}

class DropShip2 extends Unit{      // 보병
    int x, y;       // 현재 위치
    void move(int x, int y) { /** 지정된 위치로 이동 **/ }
    void load()             { /** 대상을 태운다      **/ }
    void unload()           { /** 선택된 대상을 내린다  **/ }
}

public class Abstract2
{
    /** 다형성을 이용한 그룹화 **/
    void GroupMove()
    {
        Unit[] group = new Unit[4];
        group[0] = new Marine2();
        group[1] = new Tank2();
        group[2] = new DropShip2();
        group[3] = new Marine2();
        
        for(int i = 0; i < 4; i++)
        {
            group[i].move(100, 200);
        }
    }
}
