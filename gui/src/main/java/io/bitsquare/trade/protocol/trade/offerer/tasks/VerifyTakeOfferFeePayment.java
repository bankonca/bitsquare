/*
 * This file is part of Bitsquare.
 *
 * Bitsquare is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * Bitsquare is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Bitsquare. If not, see <http://www.gnu.org/licenses/>.
 */

package io.bitsquare.trade.protocol.trade.offerer.tasks;

import io.bitsquare.btc.WalletService;
import io.bitsquare.util.handlers.ExceptionHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VerifyTakeOfferFeePayment {
    private static final Logger log = LoggerFactory.getLogger(VerifyTakeOfferFeePayment.class);

    public static void run(ExceptionHandler exceptionHandler, WalletService walletService,
                           String takeOfferFeeTxId) {
        log.trace("Run VerifyTakeOfferFeePayment task");
        //TODO mocked yet, need a confidence listeners
        int numOfPeersSeenTx = walletService.getNumOfPeersSeenTx(takeOfferFeeTxId);
       /* if (numOfPeersSeenTx > 2) {
            resultHandler.handleResult();
        }*/
    }

}