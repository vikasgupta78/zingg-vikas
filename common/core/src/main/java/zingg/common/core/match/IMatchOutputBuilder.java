package zingg.common.core.match;

import zingg.common.client.ZFrame;
import zingg.common.client.ZinggClientException;

public interface IMatchOutputBuilder<D,R,C> {

    /* takes the original blocked dataset 
     * and the predicted dupicate pairs
     */

    public ZFrame<D,R,C> getOutput(ZFrame<D, R, C> blocked, ZFrame<D, R, C> dupesActual) 
        throws ZinggClientException, Exception;

}
