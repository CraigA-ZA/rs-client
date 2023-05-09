package api.actor;

import accessors.*;
import api.SceneTile;

//@AllArgsConstructor
public abstract class ActorWrapper { //implements ActorTargeting
    private final RSActor actor;

    public ActorWrapper(RSActor actor) {
//        super(actor);
        this.actor = actor;
    }

    public abstract int getPlane();

    public SceneTile getLocation() {
        return new SceneTile(actor.getPathX()[0], actor.getPathY()[0], getPlane());
    }

    public Double getHealth() {
        RSIterableNodeDeque headbars = actor.getHeadbars();
        if (headbars == null) return null;
        RSNode headbar = headbars.getSentinel().getNext();
        if (headbar instanceof RSHeadbar) {
            RSNode update = ((RSHeadbar) headbar).getUpdates().getSentinel().getNext();
            if (update instanceof RSHeadbarUpdate) {
                RSHeadbarType def = ((RSHeadbar) headbar).getType();
                if (def != null) {
                    return ((RSHeadbarUpdate) update).getHealth() / (double) def.getWidth();
                }
            }
        }
        return null;
    }

//
//    @Override
//    public int getNpcTargetIndex() {
//        int index = actor.getTargetIndex();
//        return (index >= 0 && index <= 32767) ? index : -1;
//    }
//
//    @Override
//    public int getPlayerTargetIndex() {
//        int index = actor.getTargetIndex();
//        return (index > 32768) ? index - 32768 : -1;
//    }
//
//    public Position getModelPosition() {
//        return new Position(actor.getX(), actor.getY(), 0, getPlane());
//    }
//    public String getOverheadText() {
//        return actor.getOverheadText();
//    }
//    public int getOverheadTextCyclesRemaining() {
//        return actor.getOverheadTextCyclesRemaining();
//    }
//    public int getDefaultHeight() {
//        return actor.getDefaultHeight();
//    }
//


//    public Angle getOrientation() {
//        return Angle.of(actor.getOrientation());
//    }


//    public void setOverheadText(String value) {
//        actor.setOverheadText(value);
//    }


//    public void setOverheadTextCyclesRemaining(int value) {
//        actor.setOverheadTextCyclesRemaining(value);
//    }


}