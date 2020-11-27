package com.company;

public class CreateAbstractDocument implements ICreateDocument{
    @Override
    public IDocument CreateNew() {
        return new IDocument() {
            @Override
            public String info() {
                return null;
            }
        };
    }

    @Override
    public IDocument CreateOpen() {
        return new IDocument() {
            @Override
            public String info() {
                return null;
            }
        };
    }
}
