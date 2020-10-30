package net.ess3.api.events;

import net.ess3.api.IUser;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Fires when a /tpaccept is entered and the player has a request from someone.
 */
public class TPAAcceptEvent extends Event implements Cancellable {
    public static final HandlerList handlers = new HandlerList();
    private final IUser accepter;
    private final IUser requester;
    private boolean cancelled = false;

    public TPAAcceptEvent(final IUser accepter, final IUser requester){
        super();
        this.accepter = accepter;
        this.requester = requester;
    }

    public IUser getAccepter() {
        return accepter;
    }

    public IUser getRequester() {
        return requester;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(final boolean cancelled) {
        this.cancelled = cancelled;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
