package com.tistory.devshock.chapter7.Abstract;

class Marine {      // 보병
    int x, y;       // 현재 위치
    void move(int x, int y) { /** 지정된 위치로 이동 **/ }
    void stop()             { /** 현재 위치에 정지   **/ }
    void stimPack()         { /** 스팀팩을 사용한다  **/ }
}

class Tank {      // 보병
    int x, y;       // 현재 위치
    void move(int x, int y) { /** 지정된 위치로 이동 **/ }
    void stop()             { /** 현재 위치에 정지   **/ }
    void changeMode()       { /** 공격모드를 변환한다**/ }
}

class DropShip {      // 보병
    int x, y;       // 현재 위치
    void move(int x, int y) { /** 지정된 위치로 이동 **/ }
    void stop()             { /** 현재 위치에 정지   **/ }
    void load()             { /** 대상을 태운다      **/ }
    void unload()           { /** 선택된 대상을 내린다  **/ }
}

public class Abstract
{

}
