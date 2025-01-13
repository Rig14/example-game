package ee.taltech.examplegame.server.game;

import lombok.Getter;
import lombok.Setter;
import message.BulletState;
import message.Direction;

import static constant.Constants.BULLET_SPEED;

@Getter
@Setter
public class Bullet {
    private final Direction direction;
    private float x;
    private float y;

    public Bullet(float x, float y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void update() {
        switch (direction) {
            case UP -> y += BULLET_SPEED;
            case DOWN -> y -= BULLET_SPEED;
            case LEFT -> x -= BULLET_SPEED;
            case RIGHT -> x += BULLET_SPEED;
        }
    }

    public BulletState getState() {
        BulletState bulletState = new BulletState();
        bulletState.setX(x);
        bulletState.setY(y);
        bulletState.setDirection(direction);
        return bulletState;
    }
}
