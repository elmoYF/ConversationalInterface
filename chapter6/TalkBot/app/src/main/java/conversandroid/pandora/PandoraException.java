package conversandroid.pandora;

/*
 *  Copyright 2016 Zoraida Callejas, Michael McTear and David Griol
 *
 *  This file is part of the Conversandroid Toolkit, from the book:
 *  The Conversational Interface, Michael McTear, Zoraida Callejas and David Griol
 *  Springer 2016 <https://github.com/zoraidacallejas/ConversationalInterface/>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.

 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU General Public License for more details.

 *  You should have received a copy of the GNU General Public License
 *   along with this program. If not, see <http://www.gnu.org/licenses/>.
 */


/**
 * Exception class that incorporates an error code that allows
 * a more fine-grained processing of the reasons behind the errors
 * regarding the possible events with the Pandora services and
 * thus react accordingly

 * @author Michael McTear, Zoraida Callejas and David Griol
 * @version 4.0, 02/13/16
 *
 */
public class PandoraException extends Exception {

    private PandoraErrorCode errorCode=PandoraErrorCode.UNKNOWN;

    PandoraException(PandoraErrorCode c){
        setErrorCode(c);
    }

    public void setErrorCode(PandoraErrorCode code){
        errorCode = code;
    }

    public PandoraErrorCode getErrorCode(){
        return errorCode;
    }
}


